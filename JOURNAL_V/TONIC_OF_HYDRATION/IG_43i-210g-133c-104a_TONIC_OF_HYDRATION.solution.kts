
solution {
    puzzle = "P089"
    name = "SUM4 (Copy)"
    arm(ARM6) {
        number = 1
        position = -7 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -8 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to -7
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -4 to -7
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -5 to -1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -3 to -1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -3 to -2
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -8 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -4
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
        position = -7 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -8 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -10 to -1
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
                pivotClockwise()
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
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
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
            sequence(7) {
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
