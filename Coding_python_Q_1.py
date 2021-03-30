# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
import xml.etree.ElementTree as ET
import pandas as pd
import numpy as np

xml = '''<?xml version="1.0" encoding="UTF-8"?>
<MedlineCitationSet>
	<Article>
		<ArticleTitle>Title 1</ArticleTitle>
		<AuthorList>
			<Author>
				<LastName>Public</LastName>
				<ForeName>J Q</ForeName>
				<Initials>JQ</Initials>
			</Author>
			<Author>
				<LastName>Doe</LastName>
				<ForeName>John</ForeName>
				<Initials>J</Initials>
			</Author>
		</AuthorList>
	</Article>
	<Article>
		<ArticleTitle>Title 2</ArticleTitle>
		<AuthorList>
			<Author>
				<LastName>Doe</LastName>
				<ForeName>John</ForeName>
				<Initials>J</Initials>
			</Author>
			<Author>
				<LastName>Doe</LastName>
				<ForeName>Jane</ForeName>
				<Initials>J</Initials>

			</Author>
		</AuthorList>
	</Article>
	<Article>
		<ArticleTitle>Title 3</ArticleTitle>
		<AuthorList>
			<Author>
				<LastName>Doe</LastName>
				<ForeName>Jane</ForeName>
				<Initials>J</Initials>
			</Author>
			<Author>
				<LastName>Public</LastName>
				<ForeName>J Q</ForeName>
				<Initials>JQ</Initials>
			</Author>
		</AuthorList>
	</Article>
	<Article>
		<ArticleTitle>Title 4</ArticleTitle>
		<AuthorList>
			<Author>
				<LastName>Smith</LastName>
				<ForeName>John</ForeName>
				<Initials>J</Initials>
			</Author>
			<Author>
				<LastName>Doe</LastName>
				<ForeName>John</ForeName>
				<Initials>J</Initials>
			</Author>
		</AuthorList>
	</Article>
</MedlineCitationSet>
'''
tree = ET.fromstring(xml)
list_names = []
for node in tree.iter('AuthorList'):
    author_names = []
    for each_author in node.iter('Author'):
        author_names.append(each_author[0].text+" "+each_author[1].text)
    list_names.append(author_names)

    
u = (pd.get_dummies(pd.DataFrame(list_names), prefix='', prefix_sep='')
       .groupby(level=0, axis=1)
       .sum())

v = u.T.dot(u)
# df_names = pd.DataFrame(list_names, columns = ['Name_1', 'Name_2']) 
print(v)
