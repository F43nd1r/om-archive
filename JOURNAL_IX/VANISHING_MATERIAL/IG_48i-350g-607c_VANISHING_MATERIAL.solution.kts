
solution {
    puzzle = "P105"
    name = "B II 1-6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 2 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to 0
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = 5
        size = 3
    }
    arm(ARM2) {
        number = 5
        position = 7 to 0
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 9 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 6 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 7 to 1
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 10 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 9 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 5
    }
    glyph(ANIMISMUS) {
        position = 8 to -2
        rotation = 1
    }
    glyph(UNIFICATION) {
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 9 to 1
        rotation = 2
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = 5 to 1
        positions = listOf(2 to 1, 2 to 0, 1 to 1)
    }
    track {
        position = 6 to 1
        positions = listOf(0 to 0, 0 to -1)
    }
    conduit {
        id = 100
        position = 0 to -2
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(6)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                drop()
                extend()
                grab()
                forward()
                drop()
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(19)
                grab()
                rotateCounterClockwise()
                drop()
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(21)
                grab()
                rotateCounterClockwise()
                wait(6)
                back()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                drop()
                rotateCounterClockwise()
                grab()
                drop()
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(22)
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
