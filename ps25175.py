# 25175

def findNextPlayer(N, M, K): # 다음 차례인 사람의 번호 계산
    nextPlayer = ((M - 1 + (K - 3)) % N + N) % N + 1
    return nextPlayer

N, M, K = map(int, input().split()) # 입력을 받아 공백을 기준으로 나눔
print(findNextPlayer(N, M, K))
