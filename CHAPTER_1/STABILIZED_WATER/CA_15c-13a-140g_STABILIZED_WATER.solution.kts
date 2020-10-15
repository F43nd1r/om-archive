
solution {
    puzzle = "P007"
    name = "B CC 4T"
    arm(ARM1) {
        number = 1
        position = -3 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    track {
        position = -2 to -2
        positions = listOf(-1 to 0, -1 to 1, 0 to 1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                repeat()
            }
        }
        )
    }
}
