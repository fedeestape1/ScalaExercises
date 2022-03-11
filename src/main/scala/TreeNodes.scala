object TreeNodes extends App{

  val mono = None

  val eso = new Node(3, Some(new Node(4,None,None)), Some(new Node(3, None, Some(new Node(1, None, None)))))

  def dfsNodes(node: Node): Unit ={
    println(node.value)
    if(!node.leftNode.isEmpty) dfsNodes(node.leftNode.get)
    if(!node.rightNode.isEmpty) dfsNodes(node.rightNode.get)
  }

  dfsNodes(eso)
}


class Node(val value: Int, val leftNode: Option[Node], val rightNode: Option[Node])