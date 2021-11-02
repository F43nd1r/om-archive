
solution {
    puzzle = "P083"
    name = "29I"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 9 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 10 to -2
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 8 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 2 to -2
        rotation = -4
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 0 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 10 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 9 to -1
        rotation = 0
        positions = listOf(0 to 0)
    }
    conduit {
        id = 100
        position = 0 to -1
        rotation = 0
        positions = listOf(0 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                retract()
                drop()
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                wait(5)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(15)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                retract()
                reset()
            }
        }
        )
    }
}
