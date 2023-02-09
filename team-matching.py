import random

def match_pairs(members, previous_pairs):
    new_pairs = []
    for i in range(0, len(members), 2):
        pair = (members[i], members[i + 1])
        if not any(set(pair) & set(prev) for prev in previous_pairs):
            new_pairs.append(pair)
        else:
            new_pairs.append((pair[1], pair[0]))
    return new_pairs

team = ["plee", "jihokim", "junghan", "nahkim", "samin", "seungyel", "sujikim", "sunhkim", "yjung", "jekim"]
random.shuffle(team)
previous_pairs = []

for week in range(1, 6): # assume we are doing this for 5 weeks
    print(f"Week {week}: {match_pairs(team, previous_pairs)}")
    previous_pairs = match_pairs(team, previous_pairs)
    random.shuffle(team)
