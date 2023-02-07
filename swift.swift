import Foundation

print("What is your name?")
guard let name = readLine() else {
    print("Please enter a valid name")
    exit(0)
}

print("Hello, \(name)! How are you?")