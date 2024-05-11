chars = {
    0: [" - ",
        "| |",
        "   ",
        "| |",
        " - "],
    1: [
        "   ",
        "  |",
        "   ",
        "  |",
        "   "],
    2: [
        " - ",
        "  |",
        " - ",
        "|  ",
        " - "],
    3: [
        " - ",
        "  |",
        " - ",
        "  |",
        " - "],
    4: [
        "   ",
        "| |",
        " - ",
        "  |",
        "   "],
    5: [
        " - ",
        "|  ",
        " - ",
        "  |",
        " - "],
    6: [
        " - ",
        "|  ",
        " - ",
        "| |",
        " - "],
    7: [
        " - ",
        "  |",
        "   ",
        "  |",
        "   "],
    8: [
        " - ",
        "| |",
        " - ",
        "| |",
        " - "],
    9: [
        " - ",
        "| |",
        " - ",
        "  |",
        " - "],
}

while True:
    t = input().split()
    size = int(t[0])
    num = t[1]
    if t[0] == "0":
        break
    for i in range(5):
        if i in (0,2,4):
            for j in num:
                cs = (chars[int(j)][i])
                if j == num[-1]:
                    print(cs[0]+cs[1]*size+cs[2],end=" ")
                else:
                    print(cs[0] + cs[1] * size + cs[2], end=" ")
            print("\n",end="")
        else:
            for _ in range(size):
                for j in num:
                    cs = (chars[int(j)][i])
                    if j == num[-1]:
                        print(cs[0] + cs[1] * size + cs[2], end=" ")
                    else:
                        print(cs[0] + cs[1] * size + cs[2], end=" ")
                print("\n", end="")
