
solution {
    puzzle = "P099"
    name = "NO-TRACK"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 4
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -4 to 2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -2 to 3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = 4 to -3
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 6 to -3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 9
        position = 6 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 10
        position = 4 to 1
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 11
        position = 1 to 2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = 2 to -4
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to 1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = -3 to 3
        rotation = -3
    }
    glyph(UNIFICATION) {
        position = 4 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(4)
                extendTape()
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
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                rotateClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
