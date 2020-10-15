
solution {
    puzzle = "P105"
    name = "B X S"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 8 to -2
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 9 to -2
        rotation = -4
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 10 to 0
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 6 to 1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 8 to 1
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 0 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 9 to -1
        rotation = -6
    }
    glyph(UNIFICATION) {
        position = 7 to 0
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 0
    }
    track {
        position = 2 to 2
        positions = listOf(-2 to -1, -2 to 0, -3 to 0)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(7)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(6)
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                repeat()
                wait(5)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(5)
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(6)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(3)
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
                wait(16)
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
        )
    }
}
