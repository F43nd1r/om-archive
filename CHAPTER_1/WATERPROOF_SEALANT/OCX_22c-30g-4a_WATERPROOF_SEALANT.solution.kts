
solution {
    puzzle = "P011"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(2)
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
