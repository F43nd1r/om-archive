
solution {
    puzzle = "P089"
    name = "SUM4"
    arm(ARM6) {
        number = 1
        position = -6 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -8
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -3 to -8
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to -7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to -2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to -1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -3 to -2
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -7 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -6 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -7 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -9 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(16)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
