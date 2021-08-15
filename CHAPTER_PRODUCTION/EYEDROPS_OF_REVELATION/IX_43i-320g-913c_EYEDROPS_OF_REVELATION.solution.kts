
solution {
    puzzle = "P081"
    name = "INSTR. V2"
    arm(ARM6) {
        number = 1
        position = -2 to 5
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to 5
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 2 to 5
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 3 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 9 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 11 to 2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 12 to 0
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = -11
    }
    glyph(UNBONDER) {
        position = -1 to 4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 9 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 5
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 10 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 3
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to 6
        rotation = -21
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 2
        rotation = 1
    }
    track {
        position = 12 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to 4
        rotation = 0
    }
    conduit {
        id = 101
        position = 9 to 0
        rotation = -7
    }
    conduit {
        id = 101
        position = 2 to 2
        rotation = -5
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(15)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                extend()
                drop()
                back()
                grab()
                retract()
                reset()
                wait(10)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                retract()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
