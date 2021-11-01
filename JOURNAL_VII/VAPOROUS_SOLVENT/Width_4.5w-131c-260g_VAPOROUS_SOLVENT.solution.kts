
solution {
    puzzle = "P098"
    name = "W4.5 2T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -5
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to 0
        rotation = 11
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to 2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to 5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 0 to -1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -6 to -2
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 1 to 4
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 2 to 4
        rotation = 0
    }
    track {
        position = 2 to 3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -4 to -5
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(10)
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                wait(1)
                back()
                reset()
                wait(2)
                grab()
                forward()
                wait(1)
                back()
                reset()
                wait(2)
                grab()
                forward()
                wait(1)
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                back()
                back()
                back()
                forward()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                forward()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                forward()
                forward()
                forward()
                reset()
                repeat()
            }
        }
        )
    }
}
