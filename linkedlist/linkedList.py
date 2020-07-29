
# Python program to reverse a linked list  
# Time Complexity : O(n) 
# Space Complexity : O(1) 
  
# Node class  
class Node: 
  
    # Constructor to initialize the node object 
    def __init__(self, data): 
        self.data = data 
        self.next = None
  
class LinkedList: 
  
    # Function to initialize head 
    def __init__(self): 
        self.head = None
  
    # Function to reverse the linked list 1->2->3
    def reverse_iterative(self): 
        prev = None
        curr = self.head
        while curr is not None:
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        self.head = prev    

    # def reverse_recursive(self,head):
    #     if head == None or head.next == None:
    #         return self.head

    #     rest = self.reverse_recursive(head.next)
    #     head.next.next = head
    #     head.next = None
    #     return rest
                
    # Function to insert a new node at the beginning 
    def push(self, new_data): 
        new_node = Node(new_data) 
        new_node.next = self.head 
        self.head = new_node 
  
    # Utility function to print the linked LinkedList 
    def printList(self): 
        temp = self.head 
        while(temp): 
            print temp.data
            temp = temp.next
  
  
# Driver program to test above functions 
llist = LinkedList() 
llist.push(20) 
llist.push(4) 
llist.push(15) 
llist.push(85) 
  
print "Given Linked List"
llist.printList() 
llist.reverse_iterative() 
# llist.reverse_recursive(llist.head)
print "\nReversed Linked List"
llist.printList() 
  
# This code is contributed by Nikhil Kumar Singh(nickzuck_007) 
