
solution {
    puzzle = "w1698787102"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -13 to -5
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -11 to -4
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -13 to -7
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -15 to -7
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -15 to -8
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -14 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -19 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -20 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -9 to -5
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = -13 to -2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -14 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -17 to -3
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -12 to -4
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = -16 to -7
        rotation = -4
    }
    glyph(UNIFICATION) {
        position = -14 to -6
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -12 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -16 to -1
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(22)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(25)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
