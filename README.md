# DataStructureWithAlgo
Queue

A Queue is a linear structure which follows a particular order in which the operations are performed. 
The order is First In First Out (FIFO).
A good example of a queue is any queue of consumers for a resource where the consumer 
that came first is served first. The difference between stacks and queues is in removing. 
In a stack we remove the item the most recently added; in a queue, we remove the item the least recently added.


Binary Search Tree is a node-based binary tree data structure which has the following properties:

The left subtree of a node contains only nodes with keys lesser than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree.

Inorder Traversal 

Algorithm Inorder(tree)
   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   2. Visit the root.
   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
   
Preorder Traversal (Practice):

Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree)
   
#Postorder Traversal (Practice):

Algorithm Postorder(tree)
   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   3. Visit the root.
