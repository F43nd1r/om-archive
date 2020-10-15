
solution {
    puzzle = "P039"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 3 to 4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to 6
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 5
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to 1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -2 to 5
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -2 to 4
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to 4
        rotation = 7
    }
    glyph(CALCIFICATION) {
        position = 0 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 6
        rotation = 0
    }
    track {
        position = -1 to 4
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    track {
        position = 2 to 4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                back()
                grab()
                extend()
                forward()
                retract()
                reset()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                back()
                back()
                wait(1)
                grab()
                forward()
                back()
                drop()
                wait(4)
                grab()
                forward()
                back()
                drop()
                wait(4)
                grab()
                forward()
                back()
                drop()
                wait(4)
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(6)
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
