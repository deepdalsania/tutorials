teams = ["CSK","MI","DD","SRH","KKR","RR","RCB","KXIP"]
for home_team in teams:
    for away_team in teams:
        if home_team is not away_team:
            print(home_team + " vs " + away_team)