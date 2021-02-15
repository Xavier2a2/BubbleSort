# SortManager
This SortManager project was made to display the programming skills I have learned at Sparta Global.
The project incorporates 3 different sorters which sort a randomly generated array of integer values.
The 3 sorters are the Bubble sort, Merge sort and the Binary Tree sort.

The Bubble and Merge sorts shows knowledge and understanding of working with Java basics. All the sorters are implemented from a SortManager class.
The SortManagers method "sort", takes in the array that it needs to sort and the direction that the array should be displayed in, whether that is ascending or descending.
The sort method is overwritten depending on the sorter and the sort is executed. 
To allow the sort to be overwritten it is marked as abstract in the SortManager class.

In the Binary Tree Sorter, the Binary sort is first implements the Binary Tree which has the required methods needed for modification of the binary tree.
A nested class called "Node" is created in the binary sort which represents the different values and corresponding connections in the tree. 
Methods were created int the Node subclass to allow for modification of the binary tree while remaining true to the methods given by BinaryTree.
In the methods to get child nodes, a user created exception called ChildNotFoundException was created to catch the exception if there was no child node.
A logger was also incorporated to log and display such occurences.
