
solution {
    puzzle = "w2501727808"
    name = "NEW SOLUTION 1 (Copy) (Copy) (Copy)"
    arm(ARM3) {
        number = 1
        position = -3 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 0 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 3 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -7 to 3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -3 to 1
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -8
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -4 to 4
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
