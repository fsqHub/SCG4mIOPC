手工合约的生成 与状态图化简的思路相似

  状态图化简： 去除了接收事件涉及的状态   2018  单池多泳道图
        化简区块链记录的状态（共享的业务流程，在协作情况下就是消息收发相关的）
        化简参与者需要考虑的状态

        （类似于我们只保留消息收发的内容，但是我们更彻底）
   在协作图中，去除接收消息代表的节点可能会引起控制流混乱，需要一定的时间进行完备的考虑（可能存在很多特殊情况）
   
   activate 和enable
        SendProductOrder 后的 两个节点都是接收消息的，倘若后面该有一个发送消息的节点，那么（去除接收消息后）就会直接让该节点具备执行的条件，但这是不行的
   enable的若是接收节点，则往后移一位（即next，activate），若是发送节点，则激活他（去除enable）

   相应的，inactivate(排他网关)关系需要发生转移，若A enable B，B inactivate C，B是接收事件，则A inactivate C(假设C是发送事件)

直接映射的方法没有考虑前置条件是否满足，且无法验证（与手工合约类似）。   2016 编排图 （编排图好像只考虑信息交互，已经做了）