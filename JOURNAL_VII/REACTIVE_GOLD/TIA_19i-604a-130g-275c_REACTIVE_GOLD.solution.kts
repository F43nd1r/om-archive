
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 8"
    arm(ARM6) {
        number = 1
        position = -12 to -6
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -11 to -5
        rotation = -2
        size = 2
    }
    arm(ARM2) {
        number = 3
        position = -8 to -4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -9 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -5
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -9 to -7
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -11 to -7
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -11 to -6
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
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
