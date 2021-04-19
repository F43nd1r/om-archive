
solution {
    puzzle = "P069"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = -16
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 0
        rotation = -15
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 2
        rotation = -12
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 3
        rotation = -12
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -16
    }
    glyph(CALCIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to 2
        rotation = -13
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to 1
        rotation = -12
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 0
        rotation = -17
    }
    io(OUTPUT) {
        index = 2
        position = -1 to -2
        rotation = -17
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -1
        rotation = -15
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
