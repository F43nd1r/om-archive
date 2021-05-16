
solution {
    puzzle = "P038"
    name = "B X S F"
    arm(ARM6) {
        number = 1
        position = -1 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to -2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -1 to -4
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -4
        rotation = 0
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
