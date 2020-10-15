
solution {
    puzzle = "P011"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
