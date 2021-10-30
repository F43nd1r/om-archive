
solution {
    puzzle = "P098"
    name = "W"
    arm(ARM1) {
        number = 1
        position = 4 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to 3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to -2
        rotation = -1
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = -4 to -4
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -3 to -4
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 3 to 2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -4
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 2
        rotation = 0
    }
    track {
        position = -3 to -1
        positions = listOf(0 to -1, 0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(10)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                wait(1)
                forward()
                wait(4)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(11)
                rotateCounterClockwise()
                wait(12)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                back()
                back()
                wait(2)
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                wait(9)
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                wait(9)
                back()
                forward()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                reset()
                wait(29)
                extendTape()
            }
        }
        )
    }
}
