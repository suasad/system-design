Design and implement a Multiple Level Cache Management System with N levels, say:
L1 -> L2 -> L3 … -> LN. Each layer will store Key-Value pairs of data. Both KEY and VALUE are of type String. L1 is the top most layer with most priority. LN is the last layer with least priority. You can choose any replacement policy for the cache. 

DesignSummary, the CacheEviction Policy, and PutPolicy has been decoupled with interfaces...

CacheEvictionPolicy:
1. LRU
2. MRU
3. FRU
4. LFU

CachePutPolicy: 
1. PutLast
2. PutFirst

Number of Permutaion Possible with this design:
4*2 = 8
