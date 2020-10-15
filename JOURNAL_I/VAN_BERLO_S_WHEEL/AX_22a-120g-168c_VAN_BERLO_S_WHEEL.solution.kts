
solution {
    puzzle = "P054"
    name = "B AX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 3 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                extend()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(8)
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
