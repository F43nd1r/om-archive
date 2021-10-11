
solution {
    puzzle = "P095"
    name = "ZORFLAX TI (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = -3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -8
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 0
        rotation = 7
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                retract()
                pivotClockwise()
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
