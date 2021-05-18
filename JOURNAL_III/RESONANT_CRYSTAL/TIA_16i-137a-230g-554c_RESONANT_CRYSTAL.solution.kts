
solution {
    puzzle = "P066"
    name = "NEW SOLUTION 1 (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = -14 to -15
        rotation = -8
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -8 to -12
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -8 to -11
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -8 to -17
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -17 to -18
        rotation = -8
        size = 3
    }
    glyph(BONDER) {
        position = -8 to -15
        rotation = -1
    }
    glyph(BONDER) {
        position = -11 to -14
        rotation = -2
    }
    glyph(BONDER) {
        position = -15 to -10
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -8 to -13
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -10 to -15
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -18 to -11
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -17 to -15
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = -7 to -12
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -11 to -18
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
