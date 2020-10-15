
solution {
    puzzle = "P063"
    name = "H5"
    arm(ARM1) {
        number = 1
        position = 5 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 4 to -1
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 3 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 3 to 1
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 2 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to 1
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -2 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to 2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -12 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -13 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -10 to 0
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 12
        position = -9 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = -13 to 2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -7 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = -11 to 0
        rotation = -5
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = -10 to 1
        rotation = -4
    }
    glyph(MULTI_BONDER) {
        position = 2 to -1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -9 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -1
        rotation = 0
    }
    track {
        position = 4 to -1
        positions = listOf(-1 to 2, -2 to 3, -1 to 3)
    }
    track {
        position = -12 to -2
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -11 to 1
        positions = listOf(-2 to -1, -1 to -2, 0 to -2, 1 to -2, 1 to -1, 2 to -1, 3 to -1, 3 to -2)
    }
    track {
        position = -12 to 2
        positions = listOf(-2 to 0, -1 to 0, 0 to 0)
    }
    track {
        position = 5 to -2
        positions = listOf(-1 to 0, -1 to 1, 0 to 0, 0 to 1)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = 0 to 2
        positions = listOf(0 to -1, 0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                extend()
                extend()
                drop()
                forward()
                wait(7)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                retract()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                back()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                forward()
                reset()
                wait(1)
                retract()
                rotateClockwise()
                wait(3)
                grab()
                extend()
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(7)
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                wait(6)
                reset()
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                drop()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                wait(1)
                forward()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(16)
                forward()
                forward()
                wait(1)
                back()
                back()
                back()
                back()
                back()
                wait(1)
                forward()
                forward()
                grab()
                forward()
                forward()
                extend()
                extend()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                back()
                wait(1)
                back()
                wait(1)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(17)
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                wait(2)
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(23)
                grab()
                back()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(15)
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                wait(4)
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
