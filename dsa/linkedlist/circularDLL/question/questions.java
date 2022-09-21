package dsa.linkedlist.circularDLL.question;

import java.util.HashSet;

/*public class questions {
    void dups(linkedlist ll) {
        HashSet<Integer> hs = new HashSet<>();
        node current = ll.head;
        node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;

            }
            current = current.next;
        }
    }
// question 2 nth to the last node
node nthtoLast(linkedlist ll,int n){
    node pt1=ll.head;
    node pt2=ll.head;
    for (int i = 0; i <n; i++)
     {if (pt2==null) {return null;
     }
     pt2 =pt2.next;

        
    }while(pt2!=null){
        pt1=pt1.next;
        pt2=pt2.next;
    }
    return pt1;


}
//question 3 partition
linkedlist partition(linkedlist ll,int n)
{
  node curreNode=ll.head;
  ll.tail=ll.head;
  while (curreNode.next!=null) 
  {
    node next =curreNode.next;
    if (curreNode.value<n) {
        curreNode.next=ll.head;
        ll.head=curreNode;
    }
    else{
        curreNode.next=null;
        ll.tail.next=curreNode;
        ll.tail=curreNode;
    }
     
        curreNode=next;
    }
    ll.tail.next=null;
    return ll;
  }
  // question 4 sum list

  linkedlist sumList(linkedlist llA,linkedlist LLB)
  {
   
    node n1=llA.head;
    node n2=LLB.head;
    int carry=0;
    linkedlist resultLL=new linkedlist();
    while (n1!=null||n2!=null) 
    {int result =carry;
        if (n1!=null) 
        { result += n1.value;
          n1=n1.next;
        }
        if (n2!=null) 
        { result += n1.value;
          n2=n2.next;
        }
        resultLL.insertNode(result%10);
        result=carry/10;}
        
        return resultLL;
        
    
    
    }
    
        

   
  }/* */
  public class questions {
    void deleteDups(linkedlist ll) {
      HashSet<Integer> hs = new HashSet<>();
      node current = ll.head;
      node prev = null;
      while (current != null) {
        int curval = current.value;
        if (hs.contains(curval)) {
          prev.next = current.next;
          ll.size--;
        } else {
          hs.add(curval);
          prev = current;
        }
        current = current.next;
      }
    }
  
    // Question 2 - Nth to Last
    node nthToLast(linkedlist ll, int n) {
      node p1 = ll.head;
      node p2 = ll.head;
      for (int i =0 ; i<n; i++) {
        if (p2 == null) return null;
        p2 = p2.next;
      }
      while (p2 != null) {
        p1 = p1.next;
        p2 = p2.next;
      }
      return p1;
    }
  
    // Question 3 - Partition
  
    linkedlist partition(linkedlist ll, int x) {
      node currentNode = ll.head;
      ll.tail = ll.head;
      while (currentNode != null) {
        node next = currentNode.next;
        if (currentNode.value < x) {
          currentNode.next = ll.head;
          ll.head = currentNode;
        } else {
          ll.tail.next = currentNode;
          ll.tail = currentNode;
        }
        currentNode = next;
      }
      ll.tail.next = null;
      return ll;
    }
  
    // Question 4 - Sum Lists
    linkedlist sumLists(linkedlist llA, linkedlist llB) {
        node n1 = llA.head;
      node n2 = llB.head;
      int carry = 0;
      linkedlist resultLL = new linkedlist();
      while (n1 != null || n2 != null) {
        int result = carry;
        if (n1 != null) {
          result += n1.value;
          n1 = n1.next;
        }
        if (n2 != null) {
          result += n2.value;
          n2 = n2.next;
        }
        resultLL.insertNode(result%10);
        carry = result / 10;
      }
      return resultLL;
    }
  
    // Question 5 - Intersection
    // getKthNode
    node getKthNode(  node head, int k) {
        node current = head;
      while (k>0 && current != null) {
        current = current.next;
        k--;
      }
      return current;
    }
  
  
  
  }

