
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 11"
    arm(ARM6) {
        number = 1
        position = -8 to -7
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -5
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to -5
        rotation = 14
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -6
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -7 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -10 to -5
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -6
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = -7 to -8
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
