
solution {
    puzzle = "P022"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 5 to -7
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 5 to -6
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 1 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 1 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 10 to -7
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 10 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 9 to -3
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 9 to -6
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 9 to -7
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = 6 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = 6 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = 5 to 2
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 4 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 8 to -4
        rotation = 2
    }
    glyph(PROJECTION) {
        position = 3 to -2
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 7 to -2
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 7 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 2
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = 2 to -4
        positions = listOf(-2 to 3, -1 to 2, 0 to 1, 1 to 0, 2 to -1, 3 to -2)
    }
    track {
        position = 11 to -4
        positions = listOf(-3 to 4, -2 to 3, -2 to 2, -2 to 1, -2 to 0, -2 to -1, -2 to -2, -2 to -3)
    }
    track {
        position = 5 to 1
        positions = listOf(2 to 0, 1 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(10)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                wait(1)
                back()
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(6)
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                back()
                back()
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                back()
                back()
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                back()
                back()
                back()
                back()
                grab()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                wait(9)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                wait(6)
                reset()
            }
        }
        )
    }
}
