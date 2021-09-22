
solution {
    puzzle = "w2501727808"
    name = "NEW SOLUTION 1 (Copy) (Copy) (Copy)"
    arm(ARM3) {
        number = 1
        position = -2 to -1
        rotation = -7
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = -4
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -2 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 1
        rotation = -4
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -5 to 0
        rotation = -5
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -7
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -6
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -1 to -2
        rotation = -6
    }
    glyph(DISPOSAL) {
        position = -5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -13
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 4
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = -7
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
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
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
            sequence(3) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
