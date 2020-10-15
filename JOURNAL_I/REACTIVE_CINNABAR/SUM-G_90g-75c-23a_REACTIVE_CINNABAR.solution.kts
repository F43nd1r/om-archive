
solution {
    puzzle = "P056"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -3
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -5
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
