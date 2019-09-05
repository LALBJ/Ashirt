echo "git auto push start..."
git add .
git commit -m $1
echo "git commit message : $1"
git push
echo "git auto push end..."
