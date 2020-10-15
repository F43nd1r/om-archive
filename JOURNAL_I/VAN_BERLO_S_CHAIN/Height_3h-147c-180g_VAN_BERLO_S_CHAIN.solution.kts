
solution {
    puzzle = "P055"
    name = "H3"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 27 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 28 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 26 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 25 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 22 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 24 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 23 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 21 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 19 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 20 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 18 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 17 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 15 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 16 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 4 to 0
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 7 to -2
        positions = listOf(-3 to 0, -4 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                back()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                reset()
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
