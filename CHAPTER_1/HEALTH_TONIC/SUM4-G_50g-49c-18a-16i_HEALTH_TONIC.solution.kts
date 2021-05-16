
solution {
    puzzle = "P014"
    name = "B X S F"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
