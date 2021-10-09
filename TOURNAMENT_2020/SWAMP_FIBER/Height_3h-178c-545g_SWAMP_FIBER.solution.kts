
solution {
    puzzle = "w2501727889"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = -10 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -9 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -9 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -10 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -10 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -5 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -4 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 0 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -1 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = -5 to 0
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -4 to 0
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = -9 to 0
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -8 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -6 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 16 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 17 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 15 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 16 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 17 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 20 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 21 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 19 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 20 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 21 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 24 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 23 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 25 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -8 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 0
        rotation = 0
    }
    track {
        position = -11 to 0
        positions = listOf(2 to -1, 2 to -2, 1 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -4 to -2
        positions = listOf(3 to 1, 4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -11 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -8 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                extend()
                grab()
                retract()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(12)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                wait(2)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(12)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                forward()
                extend()
                wait(7)
                extend()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                retract()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(17)
                forward()
                wait(5)
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                forward()
                wait(2)
                grab()
                extend()
                back()
                back()
                back()
                forward()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(12)
                grab()
                back()
                extend()
                drop()
                forward()
                wait(2)
                grab()
                back()
                reset()
            }
        }
        )
    }
}
