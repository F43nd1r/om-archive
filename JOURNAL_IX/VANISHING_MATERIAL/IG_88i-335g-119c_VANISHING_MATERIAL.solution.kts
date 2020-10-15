
solution {
    puzzle = "P105"
    name = "B CI"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 9 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 8 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 6 to 1
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 10 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 8 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = 9 to -1
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 7 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    conduit {
        id = 100
        position = 8 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(6)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(15)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                extend()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                back()
                drop()
                wait(4)
                back()
                grab()
                back()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                back()
                wait(3)
                grab()
                back()
                back()
                drop()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(9)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
