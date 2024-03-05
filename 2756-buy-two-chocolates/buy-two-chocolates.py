class Solution(object):
    def buyChoco(self, prices, money):
        """
        :type prices: List[int]
        :type money: int
        :rtype: int
        """
        prices.sort()
        small=0
        if prices[0]+prices[1]<=money:
            small=prices[0]+prices[1]
        if small==0:
            return money
        return money-small