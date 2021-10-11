
solution {
    puzzle = "P095"
    name = "ZORFLAX TI (Copy) (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = 2 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 0 to -4
        rotation = -12
    }
    io(INPUT) {
        index = 0
        position = 3 to -4
        rotation = -8
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
