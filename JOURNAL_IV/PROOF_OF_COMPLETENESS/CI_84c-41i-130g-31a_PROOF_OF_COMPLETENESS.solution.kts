
solution {
    puzzle = "P069"
    name = "B FI"
    arm(ARM1) {
        number = 1
        position = 1 to 3
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to 4
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 0 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = -17
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 2
        rotation = -6
    }
    io(OUTPUT) {
        index = 2
        position = 3 to 0
        rotation = 3
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -1
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
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
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
