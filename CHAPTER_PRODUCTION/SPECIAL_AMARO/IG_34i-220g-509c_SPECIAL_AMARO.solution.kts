
solution {
    puzzle = "P083"
    name = "INSTRU (Copy) (Copy)"
    arm(PISTON) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 9 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 7 to -1
        rotation = -12
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 10 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 9 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
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
        position = 0 to 1
        rotation = 0
        positions = listOf(0 to 0)
    }
    conduit {
        id = 100
        position = 10 to -1
        rotation = 0
        positions = listOf(0 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                wait(1)
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                wait(1)
                rotateClockwise()
                extend()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateCounterClockwise()
                retract()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
