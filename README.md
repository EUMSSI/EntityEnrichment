The semantic enrichment  aims at extending the knowledge about the entities that lie in the context. 
Document enriching is today a fundamental technique to improve the quality of several text analysis tasks, including Web search. 
In this work, we present a mechanism that functions as a contextualizing tool that helps user understand more about the entities 
through different dimensions, i.e., cross-languages, global authority, distinctiveness and public attractiveness.

Information retrieval, summarization, and online advertising rely on identifying the most important words and phrases in web 
documents. While traditional techniques treat documents as collections of keywords, many NLP systems are shifting toward 
understanding documents in terms of entities. We revisit  the task of entity salience: assigning a relevance score to each entity 
in a document.

This is implemented as a UIMA component.

The metadata are listed below:

- authority (PageRank) of co-occurance graphs
- authority (PageRank) of Wikipedia link graph
- popularity (Pageview)
- Entity-based IDF (Inverse Document Frequency)
