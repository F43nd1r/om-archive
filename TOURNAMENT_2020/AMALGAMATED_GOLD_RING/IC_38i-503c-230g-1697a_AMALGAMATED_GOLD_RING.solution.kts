
solution {
    puzzle = "w2501727808"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = -2 to -3
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 3 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to 4
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 2
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -3
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -4 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
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
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
