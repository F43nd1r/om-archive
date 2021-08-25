
solution {
    puzzle = "P105"
    name = "WR 495 (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to 1
        rotation = -5
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 7 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 7 to 2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 10 to -2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 9 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = 8 to -1
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = 7 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 9 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    conduit {
        id = 100
        position = 7 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(6)
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
                wait(20)
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                wait(1)
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
            sequence(1) {
                wait(4)
                rotateClockwise()
                wait(4)
                rotateClockwise()
                wait(4)
                rotateClockwise()
                wait(4)
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
