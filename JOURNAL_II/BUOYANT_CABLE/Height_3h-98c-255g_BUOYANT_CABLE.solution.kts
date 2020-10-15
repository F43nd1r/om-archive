
solution {
    puzzle = "P062"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -3 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -30 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -28 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -26 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -24 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -22 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -20 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -18 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -16 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -14 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -31 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -5 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 4 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(4)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                grab()
                back()
                drop()
                forward()
                wait(3)
                grab()
                back()
                reset()
                wait(5)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                back()
                grab()
                back()
                drop()
                forward()
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                back()
                reset()
                wait(6)
                grab()
                back()
                reset()
                wait(4)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                drop()
                back()
                wait(7)
                reset()
                wait(4)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                forward()
                grab()
                back()
                back()
                extend()
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
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                forward()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                forward()
                reset()
                wait(13)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(16)
                back()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
