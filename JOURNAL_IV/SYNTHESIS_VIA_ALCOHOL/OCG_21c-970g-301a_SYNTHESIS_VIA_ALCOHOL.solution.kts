
solution {
    puzzle = "P071"
    name = "B CI158 4T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to -2
        rotation = -7
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -4 to -6
        rotation = -6
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -6 to 1
        rotation = -7
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -7 to 1
        rotation = -7
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = -5 to 1
        rotation = -8
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = -5 to 2
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -6 to 5
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -7 to 5
        rotation = -6
        size = 3
    }
    arm(ARM6) {
        number = 9
        position = -5 to 5
        rotation = -7
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = -5 to 6
        rotation = -7
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -1 to 2
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 0 to 1
        rotation = -9
        size = 3
    }
    arm(ARM6) {
        number = 13
        position = -5 to 4
        rotation = -7
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = 0 to 5
        rotation = -9
        size = 3
    }
    arm(ARM2) {
        number = 15
        position = 2 to -5
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 16
        position = 2 to -6
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = 1 to 1
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 18
        position = 2 to 1
        rotation = -8
        size = 2
    }
    arm(ARM6) {
        number = 19
        position = 4 to -6
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 20
        position = 4 to -5
        rotation = -4
        size = 3
    }
    arm(ARM6) {
        number = 21
        position = 5 to -3
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = 5 to -2
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 23
        position = 6 to -4
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 24
        position = 7 to -5
        rotation = -10
        size = 3
    }
    arm(ARM6) {
        number = 25
        position = 3 to 2
        rotation = -8
        size = 3
    }
    glyph(UNBONDER) {
        position = -4 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = -8
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -8
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = -6
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = -7
    }
    glyph(DUPLICATION) {
        position = -6 to -1
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = -5 to -3
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = -3 to -1
        rotation = -7
    }
    glyph(DUPLICATION) {
        position = -1 to -2
        rotation = -7
    }
    glyph(UNIFICATION) {
        position = -3 to 5
        rotation = -6
    }
    glyph(UNIFICATION) {
        position = 3 to -1
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = 0 to -6
        rotation = -8
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    track {
        position = -6 to 6
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = -7 to 6
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 0 to 1
        positions = listOf(-1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = -7 to 2
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = 3 to -6
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = 3 to -5
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    track {
        position = 7 to -4
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 6 to -3
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(20) {
                wait(9)
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(22) {
                wait(9)
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(12) {
                wait(6)
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
            sequence(15) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                back()
            }
        }
        , 
        {
            sequence(17) {
                wait(6)
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(18) {
                wait(8)
                back()
                wait(1)
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(1)
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                wait(1)
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                back()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(16) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(25) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(19) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(21) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(24) {
                wait(8)
                back()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(23) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
            }
        }
        )
    }
}
