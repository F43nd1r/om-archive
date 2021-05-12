
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -10 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -9 to -4
        rotation = 4
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = -8 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -9 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -7 to -4
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -7 to -6
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -9 to -6
        rotation = -13
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
